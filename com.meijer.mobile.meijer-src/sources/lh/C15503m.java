package lh;

import com.launchdarkly.sdk.LDContext;
import java.util.Objects;

/* renamed from: lh.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15503m {

    /* renamed from: a, reason: collision with root package name */
    public final LDContext f149631a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f149632b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C15503m c15503m = (C15503m) obj;
            if (Objects.equals(this.f149631a, c15503m.f149631a) && Objects.equals(this.f149632b, c15503m.f149632b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f149631a, this.f149632b);
    }

    public C15503m(LDContext lDContext, Integer num) {
        this.f149631a = lDContext;
        this.f149632b = num;
    }
}
