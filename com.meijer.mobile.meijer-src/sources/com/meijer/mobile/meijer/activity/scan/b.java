package com.meijer.mobile.meijer.activity.scan;

import Wd.e;
import com.meijer.mobile.meijer.activity.scan.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/scan/b;", "LWd/e$b;", "LXd/a;", "Lcom/meijer/mobile/meijer/activity/scan/a$a;", "listener", "<init>", "(Lcom/meijer/mobile/meijer/activity/scan/a$a;)V", "barcode", "LWd/f;", "b", "(LXd/a;)LWd/f;", "a", "Lcom/meijer/mobile/meijer/activity/scan/a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements e.b<Xd.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a.InterfaceC1746a listener;

    public b(a.InterfaceC1746a listener) {
        Intrinsics.j(listener, "listener");
        this.listener = listener;
    }

    @Override // Wd.e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Wd.f<Xd.a> a(Xd.a barcode) {
        Intrinsics.j(barcode, "barcode");
        return new a(this.listener);
    }
}
