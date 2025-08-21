package D6;

import D6.f;
import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import com.google.maps.android.BuildConfig;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14418g;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0001H\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010\u0015J\u0011\u00103\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010.J\u0011\u00105\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010\u001aJ\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010\u001aJ\u001d\u0010E\u001a\u00020\u00062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110CH\u0016¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010MR\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010OR\u0016\u0010R\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010QR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010OR\u0018\u0010W\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010YR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010OR\u001e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010]R\u0016\u0010_\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010YR\u0016\u0010a\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010O¨\u0006c"}, d2 = {"LD6/d;", "LD6/f;", "Lgw/g;", "source", "<init>", "(Lgw/g;)V", "", "a", "()I", "i", "j", "", "c", "", "(C)Z", "Lgw/h;", "runTerminator", "", "g", "(Lgw/h;)Ljava/lang/String;", "h", "()Ljava/lang/String;", "", "p", "(Lgw/h;)V", "u", "()V", "newTop", "l", "(I)V", "throwOnEof", "d", "(Z)I", "b", "m", "()C", "message", "", "w", "(Ljava/lang/String;)Ljava/lang/Void;", "y", "()LD6/f;", "x", "s", "F", "hasNext", "()Z", "LD6/f$a;", "peek", "()LD6/f$a;", "nextName", "nextString", "nextBoolean", "F2", "()Ljava/lang/Void;", "", "nextDouble", "()D", "", "nextLong", "()J", "LD6/e;", "q3", "()LD6/e;", "nextInt", "close", "skipValue", "", "names", "r3", "(Ljava/util/List;)I", "", "getPath", "()Ljava/util/List;", "v", "Lgw/g;", "Lgw/e;", "Lgw/e;", "buffer", "I", "peeked", "J", "peekedLong", "e", "peekedNumberLength", "f", "Ljava/lang/String;", "peekedString", "", "[I", "stack", "stackSize", "", "[Ljava/lang/String;", "pathNames", "pathIndices", "k", "indexStack", "indexStackSize", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final C14419h f5978n;

    /* renamed from: o, reason: collision with root package name */
    private static final C14419h f5979o;

    /* renamed from: p, reason: collision with root package name */
    private static final C14419h f5980p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14416e buffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int peeked;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long peekedLong;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int peekedNumberLength;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String peekedString;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String[] pathNames;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int[] pathIndices;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int[] indexStack;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int indexStackSize;

    private final int d(boolean throwOnEof) throws EOFException {
        int i10 = 0;
        while (true) {
            long j10 = i10;
            if (!this.source.t(j10 + 1)) {
                if (throwOnEof) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i10++;
            byte bL = this.buffer.l(j10);
            if (bL != 9 && bL != 10 && bL != 13 && bL != 32) {
                this.buffer.skip(i10 - 1);
                if (bL == 35) {
                    w("Malformed JSON");
                    throw new KotlinNothingValueException();
                }
                if (bL != 47 || !this.source.t(2L)) {
                    return bL;
                }
                w("Malformed JSON");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final String g(C14419h runTerminator) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jH3 = this.source.h3(runTerminator);
            if (jH3 == -1) {
                w("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.l(jH3) != 92) {
                if (sb2 == null) {
                    String strM1 = this.buffer.M1(jH3);
                    this.buffer.readByte();
                    return strM1;
                }
                sb2.append(this.buffer.M1(jH3));
                this.buffer.readByte();
                String string = sb2.toString();
                Intrinsics.g(string);
                return string;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.buffer.M1(jH3));
            this.buffer.readByte();
            sb2.append(m());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.buffer.a();
        this.source.close();
    }

    @Override // D6.f
    public void skipValue() throws IOException {
        int i10 = 0;
        do {
            Integer numValueOf = Integer.valueOf(this.peeked);
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            switch (numValueOf != null ? numValueOf.intValue() : a()) {
                case 1:
                    l(3);
                    i10++;
                    break;
                case 2:
                    this.stackSize--;
                    i10--;
                    break;
                case 3:
                    l(1);
                    i10++;
                    break;
                case 4:
                    this.stackSize--;
                    i10--;
                    break;
                case 8:
                case 12:
                    p(f5978n);
                    break;
                case 9:
                case 13:
                    p(f5979o);
                    break;
                case 10:
                case 14:
                    u();
                    break;
                case 16:
                    this.buffer.skip(this.peekedNumberLength);
                    break;
            }
            this.peeked = 0;
        } while (i10 != 0);
        int[] iArr = this.pathIndices;
        int i11 = this.stackSize;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.pathNames[i11 - 1] = BuildConfig.TRAVIS;
    }

    static {
        C14419h.Companion companion = C14419h.INSTANCE;
        f5978n = companion.d("'\\");
        f5979o = companion.d("\"\\");
        f5980p = companion.d("{}[]:, \n\t\r/\\;#=");
    }

    public d(InterfaceC14418g source) {
        Intrinsics.j(source, "source");
        this.source = source;
        this.buffer = source.e();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.stack = iArr;
        this.stackSize = 1;
        this.pathNames = new String[64];
        this.pathIndices = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.indexStack = iArr2;
        this.indexStackSize = 1;
    }

    private final int a() throws EOFException {
        int[] iArr = this.stack;
        int i10 = this.stackSize;
        int i11 = iArr[i10 - 1];
        switch (i11) {
            case 1:
                iArr[i10 - 1] = 2;
                break;
            case 2:
                int iD = d(true);
                this.buffer.readByte();
                char c10 = (char) iD;
                if (c10 != ',') {
                    if (c10 == ']') {
                        this.peeked = 4;
                        return 4;
                    }
                    w("Unterminated array");
                    throw new KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iD2 = d(true);
                    this.buffer.readByte();
                    char c11 = (char) iD2;
                    if (c11 != ',') {
                        if (c11 == '}') {
                            this.peeked = 2;
                            return 2;
                        }
                        w("Unterminated object");
                        throw new KotlinNothingValueException();
                    }
                }
                char cD = (char) d(true);
                if (cD == '\"') {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (cD != '}') {
                    w("Unexpected character: " + cD);
                    throw new KotlinNothingValueException();
                }
                if (i11 == 5) {
                    w("Expected name");
                    throw new KotlinNothingValueException();
                }
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            case 4:
                iArr[i10 - 1] = 5;
                int iD3 = d(true);
                this.buffer.readByte();
                if (((char) iD3) != ':') {
                    w("Expected ':'");
                    throw new KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i10 - 1] = 7;
                break;
            case 7:
                if (d(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                w("Malformed JSON");
                throw new KotlinNothingValueException();
            default:
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char cD2 = (char) d(true);
        if (cD2 == '\"') {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (cD2 == '\'' || cD2 == ',' || cD2 == ';') {
            w("Unexpected value");
            throw new KotlinNothingValueException();
        }
        if (cD2 == '[') {
            this.buffer.readByte();
            this.peeked = 3;
            return 3;
        }
        if (cD2 == ']') {
            if (i11 != 1) {
                w("Unexpected value");
                throw new KotlinNothingValueException();
            }
            this.buffer.readByte();
            this.peeked = 4;
            return 4;
        }
        if (cD2 == '{') {
            this.buffer.readByte();
            this.peeked = 1;
            return 1;
        }
        int i12 = i();
        if (i12 != 0) {
            return i12;
        }
        int iJ = j();
        if (iJ != 0) {
            return iJ;
        }
        if (c((char) this.buffer.l(0L))) {
            w("Malformed JSON");
            throw new KotlinNothingValueException();
        }
        w("Expected value");
        throw new KotlinNothingValueException();
    }

    private final boolean c(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        w("Unexpected character: " + c10);
        throw new KotlinNothingValueException();
    }

    private final String h() throws IOException {
        long jH3 = this.source.h3(f5980p);
        return jH3 != -1 ? this.buffer.M1(jH3) : this.buffer.n3();
    }

    private final int i() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bL = this.buffer.l(0L);
        if (bL == 116 || bL == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bL == 102 || bL == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bL != 110 && bL != 78) {
                return 0;
            }
            str = BuildConfig.TRAVIS;
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            long j10 = i11;
            if (!this.source.t(1 + j10)) {
                return 0;
            }
            byte bL2 = this.buffer.l(j10);
            if (bL2 != ((byte) str.charAt(i11)) && bL2 != ((byte) str2.charAt(i11))) {
                return 0;
            }
        }
        long j11 = length;
        if (this.source.t(1 + j11) && c((char) this.buffer.l(j11))) {
            return 0;
        }
        this.buffer.skip(j11);
        this.peeked = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (c(r11) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ae, code lost:
    
        if (r6 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b0, code lost:
    
        if (r10 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b6, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b8, code lost:
    
        if (r9 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ba, code lost:
    
        if (r9 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bd, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00be, code lost:
    
        r19.peekedLong = r7;
        r19.buffer.skip(r12);
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c9, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        if (r6 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cd, code lost:
    
        if (r6 == 4) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d0, code lost:
    
        if (r6 != 7) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d3, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d4, code lost:
    
        r19.peekedNumberLength = r5;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00da, code lost:
    
        return 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int j() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.d.j():int");
    }

    private final void l(int newTop) {
        int i10 = this.stackSize;
        int[] iArr = this.stack;
        if (i10 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.i(iArrCopyOf, "copyOf(...)");
            this.stack = iArrCopyOf;
            String[] strArr = this.pathNames;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.pathNames = (String[]) objArrCopyOf;
            int[] iArr2 = this.pathIndices;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.i(iArrCopyOf2, "copyOf(...)");
            this.pathIndices = iArrCopyOf2;
            int[] iArr3 = this.indexStack;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr3, iArr3.length * 2);
            Intrinsics.i(iArrCopyOf3, "copyOf(...)");
            this.indexStack = iArrCopyOf3;
        }
        int[] iArr4 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr4[i11] = newTop;
    }

    private final char m() throws EOFException {
        int i10;
        if (!this.source.t(1L)) {
            w("Unterminated escape sequence");
            throw new KotlinNothingValueException();
        }
        char c10 = (char) this.buffer.readByte();
        if (c10 == '\n' || c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            w("Invalid escape sequence: \\" + c10);
            throw new KotlinNothingValueException();
        }
        if (!this.source.t(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bL = this.buffer.l(i11);
            char c12 = (char) (c11 << 4);
            if (bL >= 48 && bL <= 57) {
                i10 = bL - 48;
            } else if (bL >= 97 && bL <= 102) {
                i10 = bL - 87;
            } else {
                if (bL < 65 || bL > 70) {
                    w("\\u" + this.buffer.M1(4L));
                    throw new KotlinNothingValueException();
                }
                i10 = bL - 55;
            }
            c11 = (char) (c12 + i10);
        }
        this.buffer.skip(4L);
        return c11;
    }

    private final void p(C14419h runTerminator) throws IOException {
        while (true) {
            long jH3 = this.source.h3(runTerminator);
            if (jH3 == -1) {
                w("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.l(jH3) != 92) {
                this.buffer.skip(jH3 + 1);
                return;
            } else {
                this.buffer.skip(jH3 + 1);
                m();
            }
        }
    }

    private final void u() throws IOException {
        long jH3 = this.source.h3(f5980p);
        C14416e c14416e = this.buffer;
        if (jH3 == -1) {
            jH3 = c14416e.getSize();
        }
        c14416e.skip(jH3);
    }

    private final Void w(String message) {
        throw new JsonEncodingException(message + " at path " + getPath());
    }

    @Override // D6.f
    public f F() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + getPeekedToken() + " at path " + b());
        }
        int i10 = this.stackSize;
        int i11 = i10 - 1;
        this.stackSize = i11;
        this.pathNames[i11] = null;
        int[] iArr = this.pathIndices;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.peeked = 0;
        this.indexStackSize--;
        return this;
    }

    @Override // D6.f
    public Void F2() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + getPeekedToken() + " at path " + b());
    }

    @Override // D6.f
    public List<Object> getPath() {
        return E6.b.f7036a.a(this.stackSize, this.stack, this.pathNames, this.pathIndices);
    }

    @Override // D6.f
    public boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    @Override // D6.f
    public boolean nextBoolean() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iIntValue == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + getPeekedToken() + " at path " + b());
    }

    @Override // D6.f
    public double nextDouble() throws NumberFormatException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.peekedLong;
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M1(this.peekedNumberLength);
        } else if (iIntValue == 9) {
            this.peekedString = g(f5979o);
        } else if (iIntValue == 8) {
            this.peekedString = g(f5978n);
        } else if (iIntValue == 10) {
            this.peekedString = h();
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a double but was " + getPeekedToken() + " at path " + b());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.g(str);
            double d10 = Double.parseDouble(str);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + b());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + b());
        }
    }

    @Override // D6.f
    public int nextInt() throws NumberFormatException, IOException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            long j10 = this.peekedLong;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M1(this.peekedNumberLength);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strG = g(iIntValue == 9 ? f5979o : f5978n);
            this.peekedString = strG;
            try {
                Intrinsics.g(strG);
                int i12 = Integer.parseInt(strG);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected an int but was " + getPeekedToken() + " at path " + b());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.g(str);
            double d10 = Double.parseDouble(str);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i15 = this.stackSize - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + b());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + b());
        }
    }

    @Override // D6.f
    public long nextLong() throws NumberFormatException, IOException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.peekedLong;
        }
        if (iIntValue == 16) {
            this.peekedString = this.buffer.M1(this.peekedNumberLength);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strG = g(iIntValue == 9 ? f5979o : f5978n);
            this.peekedString = strG;
            try {
                Intrinsics.g(strG);
                long j10 = Long.parseLong(strG);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            throw new JsonDataException("Expected a long but was " + getPeekedToken() + " at path " + b());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.g(str);
            double d10 = Double.parseDouble(str);
            long j11 = (long) d10;
            if (j11 == d10) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i12 = this.stackSize - 1;
                iArr3[i12] = iArr3[i12] + 1;
                return j11;
            }
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + b());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + b());
        }
    }

    @Override // D6.f
    public String nextName() throws IOException {
        String strG;
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 12:
                strG = g(f5978n);
                break;
            case 13:
                strG = g(f5979o);
                break;
            case 14:
                strG = h();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + getPeekedToken() + " at path " + b());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strG;
        return strG;
    }

    @Override // D6.f
    public String nextString() throws IOException {
        Integer numValueOf = Integer.valueOf(this.peeked);
        String strValueOf = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.peekedLong);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = g(f5978n);
                    break;
                case 9:
                    strValueOf = g(f5979o);
                    break;
                case 10:
                    strValueOf = h();
                    break;
                case 11:
                    String str = this.peekedString;
                    if (str != null) {
                        this.peekedString = null;
                        strValueOf = str;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + getPeekedToken() + " at path " + b());
            }
        } else {
            strValueOf = this.buffer.M1(this.peekedNumberLength);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
        return strValueOf;
    }

    @Override // D6.f
    /* renamed from: peek */
    public f.a getPeekedToken() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 1:
                return f.a.f5996c;
            case 2:
                return f.a.f5997d;
            case 3:
                return f.a.f5994a;
            case 4:
                return f.a.f5995b;
            case 5:
            case 6:
                return f.a.f6002i;
            case 7:
                return f.a.f6003j;
            case 8:
            case 9:
            case 10:
            case 11:
                return f.a.f5999f;
            case 12:
            case 13:
            case 14:
                return f.a.f5998e;
            case 15:
                return f.a.f6001h;
            case 16:
                return f.a.f6000g;
            case 17:
                return f.a.f6004k;
            default:
                throw new AssertionError();
        }
    }

    @Override // D6.f
    public e q3() throws IOException {
        String strNextString = nextString();
        Intrinsics.g(strNextString);
        return new e(strNextString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        skipValue();
     */
    @Override // D6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r3(java.util.List<java.lang.String> r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7e
            java.lang.String r0 = r6.nextName()
            int[] r2 = r6.indexStack
            int r3 = r6.indexStackSize
            int r3 = r3 + (-1)
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r3, r0)
            r4 = 0
            if (r3 == 0) goto L47
            int[] r0 = r6.indexStack
            int r1 = r6.indexStackSize
            int r3 = r1 + (-1)
            int r5 = r2 + 1
            r0[r3] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L46
            int[] r7 = r6.indexStack
            int r0 = r6.indexStackSize
            int r0 = r0 + (-1)
            r7[r0] = r4
        L46:
            return r2
        L47:
            r3 = r2
        L48:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L51
            r3 = r4
        L51:
            if (r3 != r2) goto L57
            r6.skipValue()
            goto Ld
        L57:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r0)
            if (r5 == 0) goto L48
            int[] r0 = r6.indexStack
            int r1 = r6.indexStackSize
            int r2 = r1 + (-1)
            int r5 = r3 + 1
            r0[r2] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L7d
            int[] r7 = r6.indexStack
            int r0 = r6.indexStackSize
            int r0 = r0 + (-1)
            r7[r0] = r4
        L7d:
            return r3
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.d.r3(java.util.List):int");
    }

    @Override // D6.f
    public f s() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 1) {
            l(3);
            this.peeked = 0;
            int i10 = this.indexStackSize;
            this.indexStackSize = i10 + 1;
            this.indexStack[i10] = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + b());
    }

    @Override // D6.f
    public void v() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // D6.f
    public f x() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + b());
        }
        int i10 = this.stackSize;
        this.stackSize = i10 - 1;
        int[] iArr = this.pathIndices;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.peeked = 0;
        return this;
    }

    @Override // D6.f
    public f y() {
        Integer numValueOf = Integer.valueOf(this.peeked);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 3) {
            l(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + b());
    }

    private final String b() {
        return CollectionsKt.B0(getPath(), ".", null, null, 0, null, null, 62, null);
    }
}
