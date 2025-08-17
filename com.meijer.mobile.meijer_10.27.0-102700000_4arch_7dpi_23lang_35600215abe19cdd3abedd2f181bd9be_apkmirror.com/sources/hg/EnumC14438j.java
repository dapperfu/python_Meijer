package hg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lhg/j;", "LDf/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC14438j implements Df.f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14438j f134909b = new EnumC14438j("EVENT_TYPE_UNKNOWN", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14438j f134910c = new EnumC14438j("SESSION_START", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC14438j[] f134911d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f134912e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EnumC14438j[] enumC14438jArrA = a();
        f134911d = enumC14438jArrA;
        f134912e = EnumEntriesKt.a(enumC14438jArrA);
    }

    private static final /* synthetic */ EnumC14438j[] a() {
        return new EnumC14438j[]{f134909b, f134910c};
    }

    public static EnumC14438j valueOf(String str) {
        return (EnumC14438j) Enum.valueOf(EnumC14438j.class, str);
    }

    public static EnumC14438j[] values() {
        return (EnumC14438j[]) f134911d.clone();
    }

    @Override // Df.f
    /* renamed from: g, reason: from getter */
    public int getNumber() {
        return this.number;
    }

    private EnumC14438j(String str, int i10, int i11) {
        this.number = i11;
    }
}
