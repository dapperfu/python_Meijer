package hj;

import fj.C14003B;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lhj/f;", "", "", "progress", "description", "<init>", "(Ljava/lang/String;III)V", "a", "I", "e", "()I", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f135686c = new f("EXPORT_READY", 0, 20, C14003B.f131746q);

    /* renamed from: d, reason: collision with root package name */
    public static final f f135687d = new f("UPDATED", 1, 40, C14003B.f131752w);

    /* renamed from: e, reason: collision with root package name */
    public static final f f135688e = new f("CREATED", 2, 40, C14003B.f131744o);

    /* renamed from: f, reason: collision with root package name */
    public static final f f135689f = new f("UNDER_MODIFICATION", 3, 40, C14003B.f131750u);

    /* renamed from: g, reason: collision with root package name */
    public static final f f135690g = new f("CONFIRMED_SHIPT", 4, 60, C14003B.f131742m);

    /* renamed from: h, reason: collision with root package name */
    public static final f f135691h = new f("CONFIRMED_MEIJER", 5, 60, C14003B.f131741l);

    /* renamed from: i, reason: collision with root package name */
    public static final f f135692i = new f("RESCHEDULED", 6, 60, C14003B.f131748s);

    /* renamed from: j, reason: collision with root package name */
    public static final f f135693j = new f("CLAIMED", 7, 65, C14003B.f131738i);

    /* renamed from: k, reason: collision with root package name */
    public static final f f135694k = new f("SHOPPED", 8, 70, C14003B.f131749t);

    /* renamed from: l, reason: collision with root package name */
    public static final f f135695l = new f("READY_FOR_PICK_UP", 9, 80, C14003B.f131747r);

    /* renamed from: m, reason: collision with root package name */
    public static final f f135696m = new f("COMPLETED_DELIVERY", 10, 80, C14003B.f131739j);

    /* renamed from: n, reason: collision with root package name */
    public static final f f135697n = new f("DELIVERED", 11, 100, C14003B.f131743n);

    /* renamed from: o, reason: collision with root package name */
    public static final f f135698o = new f("COMPLETED_PICKUP", 12, 100, C14003B.f131740k);

    /* renamed from: p, reason: collision with root package name */
    public static final f f135699p = new f("CANCELLED", 13, 100, C14003B.f131736g);

    /* renamed from: q, reason: collision with root package name */
    public static final f f135700q = new f("CANCEL_PENDING", 14, 100, C14003B.f131737h);

    /* renamed from: r, reason: collision with root package name */
    public static final f f135701r = new f("PROCESSING_ERROR", 15, 100, C14003B.f131745p);

    /* renamed from: s, reason: collision with root package name */
    public static final f f135702s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f135703t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ f[] f135704u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f135705v;

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
        f135702s = new f("MFC_READY_FOR_PICKUP", 16, 0, i10, 3, null);
        f135703t = new f("UNKNOWN", 17, i10, 0, 3, null);
        f[] fVarArrA = a();
        f135704u = fVarArrA;
        f135705v = EnumEntriesKt.a(fVarArrA);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f135686c, f135687d, f135688e, f135689f, f135690g, f135691h, f135692i, f135693j, f135694k, f135695l, f135696m, f135697n, f135698o, f135699p, f135700q, f135701r, f135702s, f135703t};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f135704u.clone();
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
        this(str, i10, (i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? C14003B.f131751v : i12);
    }
}
