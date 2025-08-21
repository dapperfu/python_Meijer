package Jv;

import com.adobe.marketing.mobile.InterfaceC6543a;
import com.adobe.marketing.mobile.L;
import com.adobe.marketing.mobile.target.o;
import com.adobe.marketing.mobile.target.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ_\u0010\u0015\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000e\u001a\u00020\u000728\u0010\u0014\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LJv/d;", "LJv/a;", "<init>", "()V", "", "Lcom/adobe/marketing/mobile/target/v;", "requestList", "Lcom/adobe/marketing/mobile/target/o;", "parameters", "", "c", "(Ljava/util/List;Lcom/adobe/marketing/mobile/target/o;)V", "", "mboxNames", "targetParameters", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mboxName", "jsonResponse", "contentCallback", "a", "(Ljava/util/List;Lcom/adobe/marketing/mobile/target/o;Lkotlin/jvm/functions/Function2;)V", "target_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class d implements a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function2 function2, String str, String json) {
        Intrinsics.j(json, "json");
        function2.invoke(str, json);
    }

    @Override // Jv.a
    public void a(List<String> mboxNames, o targetParameters, final Function2<? super String, ? super String, Unit> contentCallback) {
        Intrinsics.j(mboxNames, "mboxNames");
        Intrinsics.j(targetParameters, "targetParameters");
        Intrinsics.j(contentCallback, "contentCallback");
        List<String> list = mboxNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (final String str : list) {
            arrayList.add(new v(str, targetParameters, "{}", new InterfaceC6543a() { // from class: Jv.c
                @Override // com.adobe.marketing.mobile.InterfaceC6543a
                public final void a(Object obj) {
                    d.d(contentCallback, str, (String) obj);
                }
            }));
        }
        c(arrayList, targetParameters);
    }

    private final void c(List<? extends v> requestList, o parameters) {
        L.d(requestList, parameters);
    }
}
