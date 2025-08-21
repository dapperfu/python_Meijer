package jg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ljg/j;", "LFf/f;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC15016j implements Ff.f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15016j f140604b = new EnumC15016j("EVENT_TYPE_UNKNOWN", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15016j f140605c = new EnumC15016j("SESSION_START", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC15016j[] f140606d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f140607e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EnumC15016j[] enumC15016jArrA = a();
        f140606d = enumC15016jArrA;
        f140607e = EnumEntriesKt.a(enumC15016jArrA);
    }

    private static final /* synthetic */ EnumC15016j[] a() {
        return new EnumC15016j[]{f140604b, f140605c};
    }

    public static EnumC15016j valueOf(String str) {
        return (EnumC15016j) Enum.valueOf(EnumC15016j.class, str);
    }

    public static EnumC15016j[] values() {
        return (EnumC15016j[]) f140606d.clone();
    }

    @Override // Ff.f
    /* renamed from: g, reason: from getter */
    public int getNumber() {
        return this.number;
    }

    private EnumC15016j(String str, int i10, int i11) {
        this.number = i11;
    }
}
