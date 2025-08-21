package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubPlaceholderExtension;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "", "e", "()Ljava/lang/String;", "b", "f", "Lcom/adobe/marketing/mobile/m;", "getExtensionApi", "()Lcom/adobe/marketing/mobile/m;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class EventHubPlaceholderExtension extends AbstractC6578l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6579m extensionApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHubPlaceholderExtension(AbstractC6579m extensionApi) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        this.extensionApi = extensionApi;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "EventHub";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.eventhub";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return "3.5.0";
    }
}
