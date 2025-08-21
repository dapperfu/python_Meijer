package E7;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/String;)[B", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {
    public static final byte[] a(String str) {
        Intrinsics.j(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), Charsets.UTF_8), 8192);
        try {
            bufferedWriter.write(str);
            Unit unit = Unit.f143329a;
            CloseableKt.a(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.i(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }
}
