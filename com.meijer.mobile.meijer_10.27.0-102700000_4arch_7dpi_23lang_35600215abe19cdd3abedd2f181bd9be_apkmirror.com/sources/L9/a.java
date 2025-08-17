package L9;

import com.emarsys.core.util.serialization.SerializationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes4.dex */
public class a {
    public static Object a(byte[] bArr) throws SerializationException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            byteArrayInputStream.close();
            return objectInputStream.readObject();
        } catch (Exception unused) {
            throw new SerializationException();
        }
    }

    public static byte[] b(Object obj) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("Exception while converting object to blob", e10);
        }
    }
}
