package L0;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"LL0/h;", "", "", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "LL0/h$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LL0/h$a;", "value", "", "a", "(Ljava/lang/Object;)Z", "", "", "e", "()Ljava/util/Map;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LL0/h$a;", "", "", "unregister", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void unregister();
    }

    boolean a(Object value);

    a b(String key, Function0<? extends Object> valueProvider);

    Map<String, List<Object>> e();

    Object f(String key);
}
