package K3;

import Be.C2957c;
import a3.y;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a extends G3.c {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16285c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f16286a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f16287b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f16286a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f16287b.decode(byteBuffer).toString();
                this.f16287b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f16287b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f16287b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f16286a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new y(new c(bArr, null, null));
        }
        Matcher matcher = f16285c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = C2957c.e(strGroup);
                strE.getClass();
                if (!strE.equals("streamurl")) {
                    if (strE.equals("streamtitle")) {
                        str = strGroup2;
                    }
                } else {
                    str2 = strGroup2;
                }
            }
        }
        return new y(new c(bArr, str, str2));
    }
}
