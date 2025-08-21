package W4;

import androidx.work.impl.model.Dependency;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LW4/a;", "", "Landroidx/work/impl/model/Dependency;", "dependency", "", "a", "(Landroidx/work/impl/model/Dependency;)V", "", PreferencesHelper.PREF_ID, "", "c", "(Ljava/lang/String;)Z", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "d", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    void a(Dependency dependency);

    List<String> b(String id2);

    boolean c(String id2);

    boolean d(String id2);
}
