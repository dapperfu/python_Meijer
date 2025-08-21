package Fv;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020*H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010\u0003J\u0015\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H\u0004¢\u0006\u0004\b3\u00102J!\u00107\u001a\u0002062\u0006\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u000f2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H&¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u000fH&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001f¢\u0006\u0004\bE\u0010\u0003J\u001f\u0010G\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\fJ\u000f\u0010H\u001a\u00020\nH&¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eJ'\u0010J\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0005¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u000eJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u000eJ\u001f\u0010P\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0014¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u000f¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u0002062\u0006\u0010Y\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010Z\u001a\u00020\n¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u000f¢\u0006\u0004\b`\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010c\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010dR&\u0010m\u001a\u00060fj\u0002`g8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010\u0016\u001a\u00020\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006p"}, d2 = {"LFv/a;", "", "<init>", "()V", "", "lastPosition", "current", "b", "(II)I", "currentPosition", "", "s", "(II)Ljava/lang/String;", "M", "()Ljava/lang/String;", "", "R", "()Z", "startPosition", "a", "(I)I", "", "source", "startPos", "c", "(Ljava/lang/CharSequence;I)I", "B", "start", "f", "(I)Z", "literalSuffix", "", "h", "(Ljava/lang/String;I)V", "u", "position", "I", "e", "", "j", "()B", "N", "", "E", "(C)Z", "v", "expected", "k", "(B)B", "l", "(C)V", "Q", "expectedToken", "wasConsumed", "", "y", "(BZ)Ljava/lang/Void;", "G", "doConsume", "O", "(Z)Z", "K", "()I", "keyToMatch", "isLenient", "F", "(Ljava/lang/String;Z)Ljava/lang/String;", "H", "(Z)Ljava/lang/String;", "t", "endPos", "L", "i", "o", "p", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "r", "q", "fromIndex", "toIndex", "d", "(II)V", "allowLenientStrings", "J", "(Z)V", "toString", "key", "A", "(Ljava/lang/String;)V", "message", "hint", "w", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "m", "()J", "g", "LFv/D;", "LFv/D;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "C", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "D", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Fv.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes14.dex */
public abstract class JsonReader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public int currentPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String peekedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final D path = new D();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private StringBuilder escapedString = new StringBuilder();

    protected abstract CharSequence D();

    public abstract String F(String keyToMatch, boolean isLenient);

    public abstract int I(int position);

    public abstract int K();

    public abstract boolean e();

    public abstract String i();

    public abstract byte j();

    public abstract void l(char expected);

    public final void t() {
        this.peekedString = null;
    }

    public void u() {
    }

    private final String M() {
        String str = this.peekedString;
        Intrinsics.g(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean P(JsonReader jsonReader, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return jsonReader.O(z10);
    }

    private final int c(CharSequence source, int startPos) {
        int i10 = startPos + 4;
        if (i10 < source.length()) {
            this.escapedString.append((char) ((B(source, startPos) << 12) + (B(source, startPos + 1) << 8) + (B(source, startPos + 2) << 4) + B(source, startPos + 3)));
            return i10;
        }
        this.currentPosition = startPos;
        u();
        if (this.currentPosition + 4 < source.length()) {
            return c(source, this.currentPosition);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private static final double n(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void x(JsonReader jsonReader, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = jsonReader.currentPosition;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return jsonReader.w(str, i10, str2);
    }

    public static /* synthetic */ Void z(JsonReader jsonReader, byte b10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return jsonReader.y(b10, z10);
    }

    public final void A(String key) {
        Intrinsics.j(key, "key");
        w("Encountered an unknown key '" + key + '\'', StringsKt.x0(L(0, this.currentPosition), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: C, reason: from getter */
    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    protected final boolean E(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public final void J(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bG = G();
        if (bG != 8 && bG != 6) {
            q();
            return;
        }
        while (true) {
            byte bG2 = G();
            if (bG2 != 1) {
                if (bG2 == 8 || bG2 == 6) {
                    arrayList.add(Byte.valueOf(bG2));
                } else if (bG2 == 9) {
                    if (((Number) CollectionsKt.D0(arrayList)).byteValue() != 8) {
                        throw A.e(this.currentPosition, "found ] instead of } at path: " + this.path, D());
                    }
                    CollectionsKt.M(arrayList);
                } else if (bG2 == 7) {
                    if (((Number) CollectionsKt.D0(arrayList)).byteValue() != 6) {
                        throw A.e(this.currentPosition, "found } instead of ] at path: " + this.path, D());
                    }
                    CollectionsKt.M(arrayList);
                } else if (bG2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                q();
            } else {
                i();
            }
        }
    }

    protected final void Q(char expected) {
        int i10 = this.currentPosition;
        if (i10 > 0 && expected == '\"') {
            try {
                this.currentPosition = i10 - 1;
                String strQ = q();
                this.currentPosition = i10;
                if (Intrinsics.e(strQ, BuildConfig.TRAVIS)) {
                    w("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.currentPosition = i10;
                throw th2;
            }
        }
        z(this, C3592b.a(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    protected void d(int fromIndex, int toIndex) {
        this.escapedString.append(D(), fromIndex, toIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        x(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        x(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (D().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        x(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        x(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r18.currentPosition = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r1 = r10 * n(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        x(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e0, code lost:
    
        x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fv.JsonReader.m():long");
    }

    public final String o() {
        return this.peekedString != null ? M() : i();
    }

    protected final String p(CharSequence source, int startPosition, int current) {
        Intrinsics.j(source, "source");
        char cCharAt = source.charAt(current);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int I10 = I(b(startPosition, current));
                if (I10 == -1) {
                    x(this, "Unexpected EOF", I10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z10 = true;
                startPosition = I10;
                current = startPosition;
            } else {
                current++;
                if (current >= source.length()) {
                    d(startPosition, current);
                    int I11 = I(current);
                    if (I11 == -1) {
                        x(this, "Unexpected EOF", I11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    startPosition = I11;
                    current = startPosition;
                    z10 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(current);
        }
        String strL = !z10 ? L(startPosition, current) : s(startPosition, current);
        this.currentPosition = current + 1;
        return strL;
    }

    public final String q() {
        if (this.peekedString != null) {
            return M();
        }
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            x(this, "EOF", iK, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = C3592b.a(D().charAt(iK));
        if (bA == 1) {
            return o();
        }
        if (bA != 0) {
            x(this, "Expected beginning of the string, but got " + D().charAt(iK), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (C3592b.a(D().charAt(iK)) == 0) {
            iK++;
            if (iK >= D().length()) {
                d(this.currentPosition, iK);
                int I10 = I(iK);
                if (I10 == -1) {
                    this.currentPosition = iK;
                    return s(0, 0);
                }
                iK = I10;
                z10 = true;
            }
        }
        String strL = !z10 ? L(this.currentPosition, iK) : s(this.currentPosition, iK);
        this.currentPosition = iK;
        return strL;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public final Void w(String message, int position, String hint) {
        String str;
        Intrinsics.j(message, "message");
        Intrinsics.j(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw A.e(position, message + " at path: " + this.path.a() + str, D());
    }

    private final int B(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean R() {
        if (D().charAt(this.currentPosition - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final int a(int startPosition) {
        int I10 = I(startPosition);
        if (I10 != -1) {
            int i10 = I10 + 1;
            char cCharAt = D().charAt(I10);
            if (cCharAt == 'u') {
                return c(D(), i10);
            }
            char cB = C3592b.b(cCharAt);
            if (cB != 0) {
                this.escapedString.append(cB);
                return i10;
            }
            x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int b(int lastPosition, int current) {
        d(lastPosition, current);
        return a(current + 1);
    }

    private final boolean f(int start) {
        int I10 = I(start);
        if (I10 < D().length() && I10 != -1) {
            int i10 = I10 + 1;
            int iCharAt = D().charAt(I10) | ' ';
            if (iCharAt != 102) {
                if (iCharAt == 116) {
                    h("rue", i10);
                    return true;
                }
                x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            h("alse", i10);
            return false;
        }
        x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void h(String literalSuffix, int current) {
        if (D().length() - current >= literalSuffix.length()) {
            int length = literalSuffix.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (literalSuffix.charAt(i10) != (D().charAt(current + i10) | ' ')) {
                    x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.currentPosition = current + literalSuffix.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String s(int lastPosition, int currentPosition) {
        d(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        Intrinsics.i(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public byte G() {
        CharSequence charSequenceD = D();
        int i10 = this.currentPosition;
        while (true) {
            int I10 = I(i10);
            if (I10 != -1) {
                char cCharAt = charSequenceD.charAt(I10);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    this.currentPosition = I10;
                    return C3592b.a(cCharAt);
                }
                i10 = I10 + 1;
            } else {
                this.currentPosition = I10;
                return (byte) 10;
            }
        }
    }

    public final String H(boolean isLenient) {
        String strO;
        byte bG = G();
        if (isLenient) {
            if (bG != 1 && bG != 0) {
                return null;
            }
            strO = q();
        } else {
            if (bG != 1) {
                return null;
            }
            strO = o();
        }
        this.peekedString = strO;
        return strO;
    }

    public String L(int startPos, int endPos) {
        return D().subSequence(startPos, endPos).toString();
    }

    public final boolean N() {
        int iK = K();
        CharSequence charSequenceD = D();
        if (iK >= charSequenceD.length() || iK == -1 || charSequenceD.charAt(iK) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean O(boolean doConsume) {
        int I10 = I(K());
        int length = D().length() - I10;
        if (length < 4 || I10 == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (BuildConfig.TRAVIS.charAt(i10) != D().charAt(I10 + i10)) {
                return false;
            }
        }
        if (length > 4 && C3592b.a(D().charAt(I10 + 4)) == 0) {
            return false;
        }
        if (doConsume) {
            this.currentPosition = I10 + 4;
            return true;
        }
        return true;
    }

    public final boolean g() {
        boolean z10;
        int iK = K();
        if (iK != D().length()) {
            if (D().charAt(iK) == '\"') {
                iK++;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zF = f(iK);
            if (z10) {
                if (this.currentPosition != D().length()) {
                    if (D().charAt(this.currentPosition) == '\"') {
                        this.currentPosition++;
                        return zF;
                    }
                    x(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return zF;
        }
        x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final byte k(byte expected) {
        byte bJ = j();
        if (bJ == expected) {
            return bJ;
        }
        z(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public final String r() {
        String strQ = q();
        if (Intrinsics.e(strQ, BuildConfig.TRAVIS) && R()) {
            x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return strQ;
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + D().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void y(byte expectedToken, boolean wasConsumed) {
        int i10;
        String strValueOf;
        String strC = C3592b.c(expectedToken);
        if (wasConsumed) {
            i10 = this.currentPosition - 1;
        } else {
            i10 = this.currentPosition;
        }
        int i11 = i10;
        if (this.currentPosition != D().length() && i11 >= 0) {
            strValueOf = String.valueOf(D().charAt(i11));
        } else {
            strValueOf = "EOF";
        }
        x(this, "Expected " + strC + ", but had '" + strValueOf + "' instead", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }
}
