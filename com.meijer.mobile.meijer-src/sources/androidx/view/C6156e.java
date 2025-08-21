package androidx.view;

import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/e;", "Landroidx/lifecycle/p;", "", "Landroidx/lifecycle/i;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/i;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "[Landroidx/lifecycle/i;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6156e implements InterfaceC6169p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6160i[] generatedAdapters;

    public C6156e(InterfaceC6160i[] generatedAdapters) {
        Intrinsics.j(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        C6129C c6129c = new C6129C();
        for (InterfaceC6160i interfaceC6160i : this.generatedAdapters) {
            interfaceC6160i.a(source, event, false, c6129c);
        }
        for (InterfaceC6160i interfaceC6160i2 : this.generatedAdapters) {
            interfaceC6160i2.a(source, event, true, c6129c);
        }
    }
}
