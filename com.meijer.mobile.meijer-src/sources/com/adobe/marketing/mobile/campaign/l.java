package com.adobe.marketing.mobile.campaign;

import N5.RuleConsequence;
import R5.K;
import e6.InterfaceC13774a;
import g6.C14328a;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
abstract class l {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Class> f63257c;

    /* renamed from: a, reason: collision with root package name */
    protected final String f63258a;

    /* renamed from: b, reason: collision with root package name */
    final CampaignExtension f63259b;

    static l e(CampaignExtension campaignExtension, RuleConsequence ruleConsequence) throws o {
        if (ruleConsequence == null) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  No message consequence found. Unable to proceed.", new Object[0]);
            throw new o("Message consequence is null.");
        }
        String strO = C14328a.o(ruleConsequence.a(), "template", "");
        if (g6.i.a(strO)) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  No message template found. Unable to proceed.", new Object[0]);
            throw new o("Required message field: Message template is null or empty.");
        }
        Class cls = f63257c.get(strO);
        if (cls == null) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  Provided message type is not supported. Unable to proceed.", new Object[0]);
            return null;
        }
        try {
            return (l) cls.getDeclaredConstructor(CampaignExtension.class, RuleConsequence.class).newInstance(campaignExtension, ruleConsequence);
        } catch (IllegalAccessException e10) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  Caught IllegalAccessException exception while trying to instantiate Message object. \n (%s)", e10);
            return null;
        } catch (InstantiationException e11) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  Caught InstantiationException exception while trying to instantiate Message object.\n (%s)", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  Caught NoSuchMethodException exception while trying to instantiate Message object. \n (%s)", e12);
            return null;
        } catch (InvocationTargetException e13) {
            R5.t.a("Campaign", "CampaignMessage", "createMessageObject -  Caught InvocationTargetException exception while trying to instantiate Message object. \n (%s)", e13);
            return null;
        }
    }

    abstract void h();

    static {
        HashMap map = new HashMap();
        f63257c = map;
        map.put("fullscreen", t.class);
        map.put("alert", a.class);
        map.put("local", u.class);
    }

    protected void a(String str, String str2, String str3) {
        this.f63259b.p(str, str2, str3);
    }

    protected void b(Map<String, Object> map) {
        this.f63259b.q(map);
    }

    protected void c() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f63258a);
        map.put("a.message.clicked", String.valueOf(1));
        b(map);
    }

    protected void d(Map<String, String> map) {
        String strDecode;
        Map<String, Object> map2 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("url")) {
                try {
                    strDecode = URLDecoder.decode(value, "UTF-8");
                } catch (UnsupportedEncodingException e10) {
                    R5.t.f("Campaign", "CampaignMessage", "Failed to decode message interaction url (%s)", e10.getMessage());
                    strDecode = null;
                }
                Map<String, String> map3 = new HashMap<>();
                map3.put("messageId", this.f63258a);
                String strF = f(strDecode, map3);
                g(strF);
                map2.put(key, strF);
            } else {
                map2.put(key, value);
            }
        }
        map2.put("a.message.id", this.f63258a);
        map2.put("a.message.clicked", String.valueOf(1));
        b(map2);
    }

    protected void i() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f63258a);
        map.put("a.message.triggered", String.valueOf(1));
        b(map);
    }

    protected void j() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f63258a);
        map.put("a.message.viewed", String.valueOf(1));
        b(map);
    }

    String f(String str, Map<String, String> map) {
        if (g6.i.a(str)) {
            R5.t.a("Campaign", "CampaignMessage", "expandTokens -  Unable to expand tokens, input string is null or empty", new Object[0]);
            return str;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    str = str.replace(entry.getKey(), entry.getValue());
                }
            }
            return str;
        }
        R5.t.a("Campaign", "CampaignMessage", "expandTokens -  Unable to expand tokens, provided tokens Map is null or empty", new Object[0]);
        return str;
    }

    protected void g(String str) {
        if (g6.i.a(str)) {
            R5.t.a("Campaign", "CampaignMessage", "Cannot open a null or empty URL.", new Object[0]);
            return;
        }
        InterfaceC13774a interfaceC13774aJ = K.f().j();
        if (interfaceC13774aJ != null && interfaceC13774aJ.a(str)) {
            return;
        }
        R5.t.a("Campaign", "Could not open URL (%s)", str, new Object[0]);
    }
}
