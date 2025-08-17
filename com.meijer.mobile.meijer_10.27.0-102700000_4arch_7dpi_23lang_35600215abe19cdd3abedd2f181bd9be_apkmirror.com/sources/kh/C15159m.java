package kh;

import com.launchdarkly.sdk.LDContext;
import java.util.Objects;

/* renamed from: kh.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15159m {

    /* renamed from: a, reason: collision with root package name */
    public final LDContext f141948a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f141949b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C15159m c15159m = (C15159m) obj;
            if (Objects.equals(this.f141948a, c15159m.f141948a) && Objects.equals(this.f141949b, c15159m.f141949b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f141948a, this.f141949b);
    }

    public C15159m(LDContext lDContext, Integer num) {
        this.f141948a = lDContext;
        this.f141949b = num;
    }
}
