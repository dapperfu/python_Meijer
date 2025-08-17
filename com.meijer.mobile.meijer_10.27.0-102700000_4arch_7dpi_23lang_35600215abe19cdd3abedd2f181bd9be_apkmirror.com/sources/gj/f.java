package gj;

import ej.C13671B;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lgj/f;", "", "", "progress", "description", "<init>", "(Ljava/lang/String;III)V", "a", "I", "e", "()I", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f133620c = new f("EXPORT_READY", 0, 20, C13671B.f128757q);

    /* renamed from: d, reason: collision with root package name */
    public static final f f133621d = new f("UPDATED", 1, 40, C13671B.f128763w);

    /* renamed from: e, reason: collision with root package name */
    public static final f f133622e = new f("CREATED", 2, 40, C13671B.f128755o);

    /* renamed from: f, reason: collision with root package name */
    public static final f f133623f = new f("UNDER_MODIFICATION", 3, 40, C13671B.f128761u);

    /* renamed from: g, reason: collision with root package name */
    public static final f f133624g = new f("CONFIRMED_SHIPT", 4, 60, C13671B.f128753m);

    /* renamed from: h, reason: collision with root package name */
    public static final f f133625h = new f("CONFIRMED_MEIJER", 5, 60, C13671B.f128752l);

    /* renamed from: i, reason: collision with root package name */
    public static final f f133626i = new f("RESCHEDULED", 6, 60, C13671B.f128759s);

    /* renamed from: j, reason: collision with root package name */
    public static final f f133627j = new f("CLAIMED", 7, 65, C13671B.f128749i);

    /* renamed from: k, reason: collision with root package name */
    public static final f f133628k = new f("SHOPPED", 8, 70, C13671B.f128760t);

    /* renamed from: l, reason: collision with root package name */
    public static final f f133629l = new f("READY_FOR_PICK_UP", 9, 80, C13671B.f128758r);

    /* renamed from: m, reason: collision with root package name */
    public static final f f133630m = new f("COMPLETED_DELIVERY", 10, 80, C13671B.f128750j);

    /* renamed from: n, reason: collision with root package name */
    public static final f f133631n = new f("DELIVERED", 11, 100, C13671B.f128754n);

    /* renamed from: o, reason: collision with root package name */
    public static final f f133632o = new f("COMPLETED_PICKUP", 12, 100, C13671B.f128751k);

    /* renamed from: p, reason: collision with root package name */
    public static final f f133633p = new f("CANCELLED", 13, 100, C13671B.f128747g);

    /* renamed from: q, reason: collision with root package name */
    public static final f f133634q = new f("CANCEL_PENDING", 14, 100, C13671B.f128748h);

    /* renamed from: r, reason: collision with root package name */
    public static final f f133635r = new f("PROCESSING_ERROR", 15, 100, C13671B.f128756p);

    /* renamed from: s, reason: collision with root package name */
    public static final f f133636s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f133637t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ f[] f133638u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133639v;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int progress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int description;

    private f(String str, int i10, int i11, int i12) {
        this.progress = i11;
        this.description = i12;
    }

    static {
        int i10 = 0;
        f133636s = new f("MFC_READY_FOR_PICKUP", 16, 0, i10, 3, null);
        f133637t = new f("UNKNOWN", 17, i10, 0, 3, null);
        f[] fVarArrA = a();
        f133638u = fVarArrA;
        f133639v = EnumEntriesKt.a(fVarArrA);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f133620c, f133621d, f133622e, f133623f, f133624g, f133625h, f133626i, f133627j, f133628k, f133629l, f133630m, f133631n, f133632o, f133633p, f133634q, f133635r, f133636s, f133637t};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f133638u.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* synthetic */ f(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? C13671B.f128762v : i12);
    }
}
