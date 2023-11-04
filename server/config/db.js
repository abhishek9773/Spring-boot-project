 const mongoose = require('mongoose');
mongoose.set('strictQuery', false);
const connectDB = async() =>{    // this is the asyncronus funciton that way we are using try catch.
    try{
        const conn = await mongoose.connect('mongodb+srv://anand973:kXKY092p5WT4YWwS@cluster0.lwtsw68.mongodb.net/');
        console.log(`Database Connected:${conn.connection.host}`);

    } catch(error){
        console.log(error);

    }

}
module.exports = connectDB;