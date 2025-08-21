package R6;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"LR6/m;", "", "", "", "e", "()Ljava/util/Map;", "differences", "", "c", "(Ljava/util/Map;)V", "", "newCallbackCounts", "a", "stringsTrimmed", "charsRemoved", "b", "(II)V", "breadcrumbsRemoved", "bytesRemoved", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface m {
    void a(Map<String, Integer> newCallbackCounts);

    void b(int stringsTrimmed, int charsRemoved);

    void c(Map<String, ? extends Object> differences);

    void d(int breadcrumbsRemoved, int bytesRemoved);

    Map<String, Object> e();
}
