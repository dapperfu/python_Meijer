package c8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc8/e;", "Lorg/json/JSONObject;", "a", "(Lc8/e;)Lorg/json/JSONObject;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {
    public static final JSONObject a(TouchUserInteraction touchUserInteraction) throws JSONException {
        Intrinsics.j(touchUserInteraction, "<this>");
        List<TouchEvent> listC = touchUserInteraction.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        for (TouchEvent touchEvent : listC) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", (int) touchEvent.getX());
            jSONObject.put("y", (int) touchEvent.getY());
            arrayList.add(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("characteristics.has_user_interaction", true);
        jSONObject2.put("interaction.name", "touch");
        UiElement ancestor = touchUserInteraction.getAncestor();
        if (ancestor != null) {
            jSONObject2.put("ui_element.ancestor.name", ancestor.getName());
            jSONObject2.put("ui_element.ancestor.component", ancestor.getComponent());
            jSONObject2.put("ui_element.ancestor.id", ancestor.getId());
        }
        jSONObject2.put("ui_element.name", touchUserInteraction.getElement().getName());
        jSONObject2.put("ui_element.component", touchUserInteraction.getElement().getComponent());
        jSONObject2.put("ui_element.id", touchUserInteraction.getElement().getId());
        jSONObject2.put("pointer.positions", new JSONArray((Collection) arrayList));
        return jSONObject2;
    }
}
