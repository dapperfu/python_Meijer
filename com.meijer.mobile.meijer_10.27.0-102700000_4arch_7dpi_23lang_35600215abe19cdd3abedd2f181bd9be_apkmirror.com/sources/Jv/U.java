package Jv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"LJv/U;", "LJv/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "position", "I", "(I)I", "", "j", "()B", "", "e", "()Z", "K", "()I", "", "expected", "", "l", "(C)V", "i", "()Ljava/lang/String;", "keyToMatch", "isLenient", "F", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "S", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class U extends JsonReader {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String source;

    public U(String source) {
        Intrinsics.j(source, "source");
        this.source = source;
    }

    @Override // Jv.JsonReader
    public String F(String keyToMatch, boolean isLenient) {
        Intrinsics.j(keyToMatch, "keyToMatch");
        int i10 = this.currentPosition;
        try {
            if (j() == 6 && Intrinsics.e(H(isLenient), keyToMatch)) {
                t();
                if (j() == 5) {
                    return H(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i10;
            t();
        }
    }

    @Override // Jv.JsonReader
    public int K() {
        char cCharAt;
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return i10;
        }
        String strD = D();
        while (i10 < strD.length() && ((cCharAt = strD.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.currentPosition = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jv.JsonReader
    /* renamed from: S, reason: from getter and merged with bridge method [inline-methods] */
    public String D() {
        return this.source;
    }

    @Override // Jv.JsonReader
    public boolean e() {
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return false;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.currentPosition = i10;
        return false;
    }

    @Override // Jv.JsonReader
    public String i() {
        l('\"');
        int i10 = this.currentPosition;
        int iO0 = StringsKt.o0(D(), '\"', i10, false, 4, null);
        if (iO0 == -1) {
            q();
            y((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iO0; i11++) {
            if (D().charAt(i11) == '\\') {
                return p(D(), this.currentPosition, i11);
            }
        }
        this.currentPosition = iO0 + 1;
        String strSubstring = D().substring(i10, iO0);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // Jv.JsonReader
    public void l(char expected) {
        if (this.currentPosition == -1) {
            Q(expected);
        }
        String strD = D();
        int i10 = this.currentPosition;
        while (i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                if (cCharAt == expected) {
                    return;
                } else {
                    Q(expected);
                }
            }
            i10 = i11;
        }
        this.currentPosition = -1;
        Q(expected);
    }

    @Override // Jv.JsonReader
    public int I(int position) {
        if (position < D().length()) {
            return position;
        }
        return -1;
    }

    @Override // Jv.JsonReader
    public byte j() {
        String strD = D();
        int i10 = this.currentPosition;
        while (i10 != -1 && i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                return C3919b.a(cCharAt);
            }
            i10 = i11;
        }
        this.currentPosition = strD.length();
        return (byte) 10;
    }
}
