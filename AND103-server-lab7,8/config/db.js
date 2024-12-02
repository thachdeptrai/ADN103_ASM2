const mongoose = require("mongoose");

const mongoURI ="mongodb://localhost:27017/asm_md19304";

// Hàm kết nối
const connect = async () => {
  try {
    await mongoose.connect(mongoURI); 
    console.log("Kết nối MongoDB thành công");
  } catch (error) {
    console.error("Kết nối thất bại: ", error);
  }
};

module.exports = { connect };
