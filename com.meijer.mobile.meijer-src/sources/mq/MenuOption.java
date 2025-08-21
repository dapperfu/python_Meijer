package mq;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lmq/a;", "", "", "title", "LZ0/c;", BarcodePickDeserializer.FIELD_ICON, "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;LZ0/c;Lkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LZ0/c;", "()LZ0/c;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mq.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
final /* data */ class MenuOption {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Z0.c icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onClick;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuOption)) {
            return false;
        }
        MenuOption menuOption = (MenuOption) other;
        return Intrinsics.e(this.title, menuOption.title) && Intrinsics.e(this.icon, menuOption.icon) && Intrinsics.e(this.onClick, menuOption.onClick);
    }

    public MenuOption(String title, Z0.c icon, Function0<Unit> onClick) {
        Intrinsics.j(title, "title");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(onClick, "onClick");
        this.title = title;
        this.icon = icon;
        this.onClick = onClick;
    }

    /* renamed from: a, reason: from getter */
    public final Z0.c getIcon() {
        return this.icon;
    }

    public final Function0<Unit> b() {
        return this.onClick;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.icon.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "MenuOption(title=" + this.title + ", icon=" + this.icon + ", onClick=" + this.onClick + ')';
    }
}
