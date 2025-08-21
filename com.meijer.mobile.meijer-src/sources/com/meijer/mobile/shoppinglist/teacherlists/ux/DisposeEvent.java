package com.meijer.mobile.shoppinglist.teacherlists.ux;

import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/u1;", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "event", "<init>", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "()Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.u1, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class DisposeEvent implements v1.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final v1.f event;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DisposeEvent) && Intrinsics.e(this.event, ((DisposeEvent) other).event);
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    public String toString() {
        return "DisposeEvent(event=" + this.event + ')';
    }

    public DisposeEvent(v1.f event) {
        Intrinsics.j(event, "event");
        this.event = event;
    }

    /* renamed from: a, reason: from getter */
    public final v1.f getEvent() {
        return this.event;
    }
}
