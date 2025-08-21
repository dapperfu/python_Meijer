package androidx.compose.ui.platform;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "name", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/N1;", "Landroidx/compose/ui/platform/N1;", "()Landroidx/compose/ui/platform/N1;", "properties", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N1 properties = new N1();

    /* renamed from: a, reason: from getter */
    public final N1 getProperties() {
        return this.properties;
    }

    public final void b(String str) {
        this.name = str;
    }

    public final void c(Object obj) {
        this.value = obj;
    }
}
