package I3;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f14144a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f14145b;

    public byte[] a(a aVar) throws IOException {
        this.f14144a.reset();
        try {
            b(this.f14145b, aVar.f14138a);
            String str = aVar.f14139b;
            if (str == null) {
                str = "";
            }
            b(this.f14145b, str);
            this.f14145b.writeLong(aVar.f14140c);
            this.f14145b.writeLong(aVar.f14141d);
            this.f14145b.write(aVar.f14142e);
            this.f14145b.flush();
            return this.f14144a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f14144a = byteArrayOutputStream;
        this.f14145b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
