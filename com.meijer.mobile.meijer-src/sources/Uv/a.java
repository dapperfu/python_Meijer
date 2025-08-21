package Uv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"LUv/a;", "", "", "httpCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final a f39038c = new a("NO_ERROR", 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final a f39039d = new a("PROTOCOL_ERROR", 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final a f39040e = new a("INTERNAL_ERROR", 2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final a f39041f = new a("FLOW_CONTROL_ERROR", 3, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final a f39042g = new a("SETTINGS_TIMEOUT", 4, 4);

    /* renamed from: h, reason: collision with root package name */
    public static final a f39043h = new a("STREAM_CLOSED", 5, 5);

    /* renamed from: i, reason: collision with root package name */
    public static final a f39044i = new a("FRAME_SIZE_ERROR", 6, 6);

    /* renamed from: j, reason: collision with root package name */
    public static final a f39045j = new a("REFUSED_STREAM", 7, 7);

    /* renamed from: k, reason: collision with root package name */
    public static final a f39046k = new a("CANCEL", 8, 8);

    /* renamed from: l, reason: collision with root package name */
    public static final a f39047l = new a("COMPRESSION_ERROR", 9, 9);

    /* renamed from: m, reason: collision with root package name */
    public static final a f39048m = new a("CONNECT_ERROR", 10, 10);

    /* renamed from: n, reason: collision with root package name */
    public static final a f39049n = new a("ENHANCE_YOUR_CALM", 11, 11);

    /* renamed from: o, reason: collision with root package name */
    public static final a f39050o = new a("INADEQUATE_SECURITY", 12, 12);

    /* renamed from: p, reason: collision with root package name */
    public static final a f39051p = new a("HTTP_1_1_REQUIRED", 13, 13);

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ a[] f39052q;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39053r;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int httpCode;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUv/a$a;", "", "<init>", "()V", "", "code", "LUv/a;", "a", "(I)LUv/a;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Uv.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final a a(int code) {
            for (a aVar : a.values()) {
                if (aVar.getHttpCode() == code) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        a[] aVarArrA = a();
        f39052q = aVarArrA;
        f39053r = EnumEntriesKt.a(aVarArrA);
        INSTANCE = new Companion(null);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f39038c, f39039d, f39040e, f39041f, f39042g, f39043h, f39044i, f39045j, f39046k, f39047l, f39048m, f39049n, f39050o, f39051p};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39052q.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getHttpCode() {
        return this.httpCode;
    }

    private a(String str, int i10, int i11) {
        this.httpCode = i11;
    }
}
