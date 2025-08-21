package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes12.dex */
public final class PathWalkOption {

    /* renamed from: a, reason: collision with root package name */
    public static final PathWalkOption f143695a = new PathWalkOption("INCLUDE_DIRECTORIES", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final PathWalkOption f143696b = new PathWalkOption("BREADTH_FIRST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final PathWalkOption f143697c = new PathWalkOption("FOLLOW_LINKS", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ PathWalkOption[] f143698d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143699e;

    private static final /* synthetic */ PathWalkOption[] a() {
        return new PathWalkOption[]{f143695a, f143696b, f143697c};
    }

    static {
        PathWalkOption[] pathWalkOptionArrA = a();
        f143698d = pathWalkOptionArrA;
        f143699e = EnumEntriesKt.a(pathWalkOptionArrA);
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) f143698d.clone();
    }

    private PathWalkOption(String str, int i10) {
    }
}
