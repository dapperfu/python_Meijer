package Uq;

import Tq.StoreTenant;
import com.meijer.mobile.store.model.hybris.HybrisStoreTenant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreTenant;", "LTq/l;", "a", "(Lcom/meijer/mobile/store/model/hybris/HybrisStoreTenant;)LTq/l;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {
    public static final StoreTenant a(HybrisStoreTenant hybrisStoreTenant) {
        Intrinsics.j(hybrisStoreTenant, "<this>");
        return new StoreTenant(hybrisStoreTenant.getCode(), hybrisStoreTenant.getName(), hybrisStoreTenant.getPhone(), hybrisStoreTenant.getUrl());
    }
}
