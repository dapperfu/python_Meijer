package com.meijer.mobile.chatbot.ux;

import Jk.AppVersion;
import okhttp3.Headers;
import pk.k;
import pu.InterfaceC16421a;

/* loaded from: classes7.dex */
public final class g implements InterfaceC16421a<ChatBotActivity> {
    public static void a(ChatBotActivity chatBotActivity, AppVersion appVersion) {
        chatBotActivity.appVersion = appVersion;
    }

    public static void b(ChatBotActivity chatBotActivity, tj.b bVar) {
        chatBotActivity.chatBotRepository = bVar;
    }

    public static void c(ChatBotActivity chatBotActivity, String str) {
        chatBotActivity.fullstorySessionId = str;
    }

    public static void d(ChatBotActivity chatBotActivity, Headers headers) {
        chatBotActivity.globalHeaders = headers;
    }

    public static void e(ChatBotActivity chatBotActivity, Cl.e eVar) {
        chatBotActivity.meijerIntent = eVar;
    }

    public static void f(ChatBotActivity chatBotActivity, k kVar) {
        chatBotActivity.userAgentInterceptor = kVar;
    }
}
