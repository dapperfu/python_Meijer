package e8;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Le8/g;", "", "", "Le8/c;", "touchList", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/View;", "interactView", "Le8/e;", "a", "(Ljava/util/List;Landroid/view/ViewGroup;Landroid/view/View;)Le8/e;", "Le8/a;", "composeHitEvent", "b", "(Ljava/util/List;Le8/a;)Le8/e;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g {
    TouchUserInteraction a(List<TouchEvent> touchList, ViewGroup rootView, View interactView);

    TouchUserInteraction b(List<TouchEvent> touchList, C13778a composeHitEvent);
}
