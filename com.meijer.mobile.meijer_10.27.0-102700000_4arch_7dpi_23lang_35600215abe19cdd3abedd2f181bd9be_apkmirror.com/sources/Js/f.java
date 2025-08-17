package Js;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LJs/f;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f16125b = new f("YOUTUBE", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f16126c = new f("MP4", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f16127d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16128e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    public static EnumEntries<f> b() {
        return f16128e;
    }

    static {
        f[] fVarArrA = a();
        f16127d = fVarArrA;
        f16128e = EnumEntriesKt.a(fVarArrA);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f16125b, f16126c};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16127d.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private f(String str, int i10, int i11) {
        this.value = i11;
    }
}
