public class b2 {
    public static void main(String[] args) {

        int n = 10000;
        long startString = System.currentTimeMillis();

        String str = "Hello";

        for (int i = 0; i < n; i++) {
            str += " World";
        }

        long endString = System.currentTimeMillis();

        long startBuilder = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < n; i++) {
            sb.append(" World");
        }

        long endBuilder = System.currentTimeMillis();

        long startBuffer = System.currentTimeMillis();

        StringBuffer sf = new StringBuffer("Hello");

        for (int i = 0; i < n; i++) {
            sf.append(" World");
        }

        long endBuffer = System.currentTimeMillis();

        System.out.println("Thời gian String: "
                + (endString - startString) + " ms");

        System.out.println("Thời gian StringBuilder: "
                + (endBuilder - startBuilder) + " ms");

        System.out.println("Thời gian StringBuffer: "
                + (endBuffer - startBuffer) + " ms");

        System.out.println("\nNHẬN XÉT:");
        System.out.println("- String chậm nhất vì mỗi lần nối tạo ra object mới.");
        System.out.println("- StringBuilder nhanh nhất vì không đồng bộ hóa (non-thread-safe).");
        System.out.println("- StringBuffer chậm hơn StringBuilder vì có đồng bộ hóa (thread-safe).");

        System.out.println("\nTRƯỜNG HỢP SỬ DỤNG:");
        System.out.println("- String: dùng cho chuỗi ít thay đổi.");
        System.out.println("- StringBuilder: dùng khi nối chuỗi nhiều trong chương trình đơn luồng.");
        System.out.println("- StringBuffer: dùng khi xử lý đa luồng cần đảm bảo an toàn dữ liệu.");
    }
}