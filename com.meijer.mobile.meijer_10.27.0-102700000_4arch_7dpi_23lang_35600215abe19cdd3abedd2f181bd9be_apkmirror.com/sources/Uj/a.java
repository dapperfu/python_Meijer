package Uj;

import Bj.o;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\f¨\u0006\u0015"}, d2 = {"LUj/a;", "", "", "titleResourceId", "instructionsResourceId", "walkThroughResourceId", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "<init>", "(Ljava/lang/String;IIIILcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;)V", "a", "I", "e", "()I", "b", "c", "l", "d", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "m", "()Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f36070e = new a("RECEIPTS_SAVINGS", 0, o.f3050w0, o.f3048v0, o.f3052x0, null);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f36071f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f36072g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int titleResourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int instructionsResourceId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int walkThroughResourceId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WalkThroughType walkThroughType;

    static {
        a[] aVarArrA = a();
        f36071f = aVarArrA;
        f36072g = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f36070e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36071f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getInstructionsResourceId() {
        return this.instructionsResourceId;
    }

    /* renamed from: e, reason: from getter */
    public final int getTitleResourceId() {
        return this.titleResourceId;
    }

    /* renamed from: l, reason: from getter */
    public final int getWalkThroughResourceId() {
        return this.walkThroughResourceId;
    }

    /* renamed from: m, reason: from getter */
    public final WalkThroughType getWalkThroughType() {
        return this.walkThroughType;
    }

    private a(String str, int i10, int i11, int i12, int i13, WalkThroughType walkThroughType) {
        this.titleResourceId = i11;
        this.instructionsResourceId = i12;
        this.walkThroughResourceId = i13;
        this.walkThroughType = walkThroughType;
    }
}
