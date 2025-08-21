package Fh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LFh/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10484a = new f("PHONE_UPDATE_SUCCESS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f10485b = new f("PHONE_NUMBER_ALREADY_TAKEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f10486c = new f("OTHER_ERROR_WITH_PHONE_NUMBER", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f10487d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10488e;

    static {
        f[] fVarArrA = a();
        f10487d = fVarArrA;
        f10488e = EnumEntriesKt.a(fVarArrA);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f10484a, f10485b, f10486c};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10487d.clone();
    }

    private f(String str, int i10) {
    }
}
