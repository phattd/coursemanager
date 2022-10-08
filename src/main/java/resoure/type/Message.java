package resoure.type;

public enum Message {
    OK {
        @Override
        public String toString() {
            return "Thành công";
        }
    },
    CANT_CONNECT_TO_DATA {
        @Override
        public String toString() {
            return "Không thể kết nối tới cơ sở dữ liệu";
        }
    },
    ERROR_QUERY_SQL  {
        @Override
        public String toString() {
            return "Lỗi truy vấn cơ sở dữ liệu";
        }
    },
    ERROR_ADD_DATA{
        @Override
        public String toString() {
            return "Lỗi thêm dữ liệu";
        }
    },
    ERROR_REMOVE_DATA{
        @Override
        public String toString() {
            return "Lỗi xóa dữ liệu";
        }
    },ERROR_UPDATE_DATA{
        @Override
        public String toString() {
            return "Lỗi cập nhật dữ liệu";
        }
    },
    ERROR_GET_DATA {
        @Override
        public String toString() {
            return "Không thể lấy dữ liệu.";
        }
    },
    ERROR_EMPTY_INPUT {
        @Override
        public String toString() {
            return "Đầu vào rỗng.";
        }
    },
    ERROR_DATATYPE_INPUT {
        @Override
        public String toString() {
            return "Dữ liệu nhập sai kiểu";
        }
    },
    ERROR_LIMIT_SCORE_INPUT {
        @Override
        public String toString() {
            return "Điểm nhỏ hơn 10 và lớn hơn 0.";
        }
    },
    ERROR_UNKNOWN {
        @Override
        public String toString() {
            return "Lỗi không xác định.";
        }
    },
    ERROR_EXIST_VALUE {
        @Override
        public String toString() {
            return "Giá trị đã tồn tại.";
        }
    },
    ERROR_UNEXIST_VALUE {
        @Override
        public String toString() {
            return "Giá trị chưa tồn tại.";
        }
    }

}
