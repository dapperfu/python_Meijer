package Q0;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"LQ0/I;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "LQ0/K;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Landroidx/compose/ui/geometry/Rect;", "b", "Landroidx/compose/ui/geometry/Rect;", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "boundingBox", "Lkotlin/Function1;", "", "", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onFill", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    public static final int f27395e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f27396f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<K> autofillTypes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect boundingBox;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Unit> onFill;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof I)) {
            return false;
        }
        I i10 = (I) other;
        return Intrinsics.e(this.autofillTypes, i10.autofillTypes) && Intrinsics.e(this.boundingBox, i10.boundingBox) && this.onFill == i10.onFill;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f27395e = 8;
        f27396f = companion;
    }

    public final List<K> a() {
        return this.autofillTypes;
    }

    /* renamed from: b, reason: from getter */
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final Function1<String, Unit> c() {
        return this.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
