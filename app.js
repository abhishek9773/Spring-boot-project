require('dotenv').config();

const express = require('express');
const expressLayout = require('express-ejs-layouts');

const app = express();
const port  = 5000 || process.env.PORT;    // we are giving to the env engin to port

app.use(express.urlencoded({extended:true}));
app.use(express.json());

// Static File 
app.use(express.static('public'));

// Templating Engine
app.use(expressLayout);
app.set('layout', './layouts/main');
app.set('view engine', 'ejs');

// route
app.use('/',require('./server/routes/index'));



//----------------------------------------------------------------------
// app.get('/', function(req,res){
//     const locals = {
//         title: 'Nodejs Notes',
//         description : 'Free Nodejs Nodes App'
//     }
//     res.render('index', locals);


// });
//================================================================================

app.listen(port, () => {
    console.log(`App listening on port ${port}`);
})