package I3;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f13471a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f13472b;

    public byte[] a(a aVar) throws IOException {
        this.f13471a.reset();
        try {
            b(this.f13472b, aVar.f13465a);
            String str = aVar.f13466b;
            if (str == null) {
                str = "";
            }
            b(this.f13472b, str);
            this.f13472b.writeLong(aVar.f13467c);
            this.f13472b.writeLong(aVar.f13468d);
            this.f13472b.write(aVar.f13469e);
            this.f13472b.flush();
            return this.f13471a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13471a = byteArrayOutputStream;
        this.f13472b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
