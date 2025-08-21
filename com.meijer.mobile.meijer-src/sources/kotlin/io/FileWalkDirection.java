package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FileWalkDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f143628a = new FileWalkDirection("TOP_DOWN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f143629b = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ FileWalkDirection[] f143630c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143631d;

    private static final /* synthetic */ FileWalkDirection[] a() {
        return new FileWalkDirection[]{f143628a, f143629b};
    }

    static {
        FileWalkDirection[] fileWalkDirectionArrA = a();
        f143630c = fileWalkDirectionArrA;
        f143631d = EnumEntriesKt.a(fileWalkDirectionArrA);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f143630c.clone();
    }

    private FileWalkDirection(String str, int i10) {
    }
}
