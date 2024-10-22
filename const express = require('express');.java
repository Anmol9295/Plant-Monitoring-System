const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.static('public')); // Serves HTML, CSS, JS from 'public' folder

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/public/index.html');
});

app.get('/usage', (req, res) => {
    res.sendFile(__dirname + '/public/usage.html');
});

app.get('/buy', (req, res) => {
    res.sendFile(__dirname + '/public/buy.html');
});

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
