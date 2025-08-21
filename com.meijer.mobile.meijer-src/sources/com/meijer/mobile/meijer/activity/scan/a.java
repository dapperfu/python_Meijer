package com.meijer.mobile.meijer.activity.scan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/scan/a;", "LWd/f;", "LXd/a;", "Lcom/meijer/mobile/meijer/activity/scan/a$a;", "listener", "<init>", "(Lcom/meijer/mobile/meijer/activity/scan/a$a;)V", "", "i", "barcode", "", "e", "(ILXd/a;)V", "a", "Lcom/meijer/mobile/meijer/activity/scan/a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends Wd.f<Xd.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1746a listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/scan/a$a;", "", "LXd/a;", "barcode", "", "C", "(LXd/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.scan.a$a, reason: collision with other inner class name */
    public interface InterfaceC1746a {
        void C(Xd.a barcode);
    }

    public a(InterfaceC1746a listener) {
        Intrinsics.j(listener, "listener");
        this.listener = listener;
    }

    @Override // Wd.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(int i10, Xd.a barcode) {
        Intrinsics.j(barcode, "barcode");
        this.listener.C(barcode);
    }
}
