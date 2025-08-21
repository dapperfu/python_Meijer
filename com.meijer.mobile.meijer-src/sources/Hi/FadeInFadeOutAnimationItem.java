package Hi;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B<\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012+\u0010\u000b\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0010\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\nHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR<\u0010\u000b\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"LHi/b;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "content", "Lcom/meijer/mobile/android_acres_library/composables/state/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "a", "()Ljava/lang/Object;", "b", "()Lkotlin/jvm/functions/Function3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "Lkotlin/jvm/functions/Function3;", "getTransition", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hi.b, reason: from toString */
/* loaded from: classes8.dex */
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> transition;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return Intrinsics.e(this.key, fadeInFadeOutAnimationItem.key) && Intrinsics.e(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t10, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> transition) {
        Intrinsics.j(transition, "transition");
        this.key = t10;
        this.transition = transition;
    }

    public final T a() {
        return this.key;
    }

    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> b() {
        return this.transition;
    }

    public final T c() {
        return this.key;
    }

    public int hashCode() {
        T t10 = this.key;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
