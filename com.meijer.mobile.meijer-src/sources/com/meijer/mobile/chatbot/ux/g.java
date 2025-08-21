package com.meijer.mobile.chatbot.ux;

import Kk.AppVersion;
import lu.InterfaceC15612a;
import okhttp3.Headers;
import qk.k;

/* loaded from: classes8.dex */
public final class g implements InterfaceC15612a<ChatBotActivity> {
    public static void a(ChatBotActivity chatBotActivity, AppVersion appVersion) {
        chatBotActivity.appVersion = appVersion;
    }

    public static void b(ChatBotActivity chatBotActivity, uj.b bVar) {
        chatBotActivity.chatBotRepository = bVar;
    }

    public static void c(ChatBotActivity chatBotActivity, String str) {
        chatBotActivity.fullstorySessionId = str;
    }

    public static void d(ChatBotActivity chatBotActivity, Headers headers) {
        chatBotActivity.globalHeaders = headers;
    }

    public static void e(ChatBotActivity chatBotActivity, Dl.e eVar) {
        chatBotActivity.meijerIntent = eVar;
    }

    public static void f(ChatBotActivity chatBotActivity, k kVar) {
        chatBotActivity.userAgentInterceptor = kVar;
    }
}
