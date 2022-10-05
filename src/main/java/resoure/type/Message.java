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
            return "Không thể lấy sách.";
        }
    }

}
