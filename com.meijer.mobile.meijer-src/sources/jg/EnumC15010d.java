package jg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\t¨\u0006\u0010"}, d2 = {"Ljg/d;", "LFf/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "d", "e", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC15010d implements Ff.f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15010d f140588b = new EnumC15010d("COLLECTION_UNKNOWN", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15010d f140589c = new EnumC15010d("COLLECTION_SDK_NOT_INSTALLED", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15010d f140590d = new EnumC15010d("COLLECTION_ENABLED", 2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC15010d f140591e = new EnumC15010d("COLLECTION_DISABLED", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC15010d f140592f = new EnumC15010d("COLLECTION_DISABLED_REMOTE", 4, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC15010d f140593g = new EnumC15010d("COLLECTION_SAMPLED", 5, 5);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC15010d[] f140594h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f140595i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EnumC15010d[] enumC15010dArrA = a();
        f140594h = enumC15010dArrA;
        f140595i = EnumEntriesKt.a(enumC15010dArrA);
    }

    private static final /* synthetic */ EnumC15010d[] a() {
        return new EnumC15010d[]{f140588b, f140589c, f140590d, f140591e, f140592f, f140593g};
    }

    public static EnumC15010d valueOf(String str) {
        return (EnumC15010d) Enum.valueOf(EnumC15010d.class, str);
    }

    public static EnumC15010d[] values() {
        return (EnumC15010d[]) f140594h.clone();
    }

    @Override // Ff.f
    /* renamed from: g, reason: from getter */
    public int getNumber() {
        return this.number;
    }

    private EnumC15010d(String str, int i10, int i11) {
        this.number = i11;
    }
}
