package eq;

import androidx.compose.runtime.Composer;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Leq/t0;", "", "", "name", BarcodePickDeserializer.FIELD_ICON, "Lkotlin/Function0;", "", "screen", "<init>", "(IILkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eq.t0, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class TabScreen {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<Composer, Integer, Unit> screen;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabScreen)) {
            return false;
        }
        TabScreen tabScreen = (TabScreen) other;
        return this.name == tabScreen.name && this.icon == tabScreen.icon && Intrinsics.e(this.screen, tabScreen.screen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabScreen(int i10, int i11, Function2<? super Composer, ? super Integer, Unit> screen) {
        Intrinsics.j(screen, "screen");
        this.name = i10;
        this.icon = i11;
        this.screen = screen;
    }

    /* renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: b, reason: from getter */
    public final int getName() {
        return this.name;
    }

    public final Function2<Composer, Integer, Unit> c() {
        return this.screen;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.name) * 31) + Integer.hashCode(this.icon)) * 31) + this.screen.hashCode();
    }

    public String toString() {
        return "TabScreen(name=" + this.name + ", icon=" + this.icon + ", screen=" + this.screen + ')';
    }
}
