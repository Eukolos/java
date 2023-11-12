package com.eukolos.effectivejava.chapter2.item8;


//  using close method rather than finalize method is too right way to do it
public class Resource implements AutoCloseable {
    private boolean closed = false;

    // Kaynaklarınızla ilgili kodlar buraya

    @Override
    public void close() throws Exception {
        if (!closed) {
            // Kaynakları serbest bırakmak için temizleme kodu
            closed = true;
            System.out.println("Nesne kapatıldı");
        }
    }

    public void anotherMethod() {
        if (closed) {
            throw new IllegalStateException("Nesne kapatıldı");
        }
        // Diğer yöntemle ilgili kodlar
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            // Kaynağı kullanan kodlar
            resource.anotherMethod();
            System.out.println("Nesne kullanıldı");
        } catch (Exception e) {
            // İstisnaları yönet
            e.printStackTrace();
        }
    }
}
