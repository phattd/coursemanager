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
    }
}
