package jg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ljg/u;", "LFf/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "d", "e", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC15026u implements Ff.f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15026u f140630b = new EnumC15026u("LOG_ENVIRONMENT_UNKNOWN", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15026u f140631c = new EnumC15026u("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15026u f140632d = new EnumC15026u("LOG_ENVIRONMENT_STAGING", 2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC15026u f140633e = new EnumC15026u("LOG_ENVIRONMENT_PROD", 3, 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC15026u[] f140634f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f140635g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EnumC15026u[] enumC15026uArrA = a();
        f140634f = enumC15026uArrA;
        f140635g = EnumEntriesKt.a(enumC15026uArrA);
    }

    private static final /* synthetic */ EnumC15026u[] a() {
        return new EnumC15026u[]{f140630b, f140631c, f140632d, f140633e};
    }

    public static EnumC15026u valueOf(String str) {
        return (EnumC15026u) Enum.valueOf(EnumC15026u.class, str);
    }

    public static EnumC15026u[] values() {
        return (EnumC15026u[]) f140634f.clone();
    }

    @Override // Ff.f
    /* renamed from: g, reason: from getter */
    public int getNumber() {
        return this.number;
    }

    private EnumC15026u(String str, int i10, int i11) {
        this.number = i11;
    }
}
