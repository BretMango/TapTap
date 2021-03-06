/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.internal.logging;
/**
 * Constants for mestrics logs.
 *
 * @hide
 */
public interface MetricsConstants {
    // These constants must match those in the analytic pipeline.
    public static final int ACCESSIBILITY = 2;
    public static final int ACCESSIBILITY_CAPTION_PROPERTIES = 3;
    public static final int ACCESSIBILITY_SERVICE = 4;
    public static final int ACCESSIBILITY_TOGGLE_DALTONIZER = 5;
    public static final int ACCESSIBILITY_TOGGLE_GLOBAL_GESTURE = 6;
    public static final int ACCESSIBILITY_TOGGLE_SCREEN_MAGNIFICATION = 7;
    public static final int ACCOUNT = 8;
    public static final int ACCOUNTS_ACCOUNT_SYNC = 9;
    public static final int ACCOUNTS_CHOOSE_ACCOUNT_ACTIVITY = 10;
    public static final int ACCOUNTS_MANAGE_ACCOUNTS = 11;
    public static final int ACTION_WIFI_ADD_NETWORK = 134;
    public static final int ACTION_WIFI_CONNECT = 135;
    public static final int ACTION_WIFI_FORCE_SCAN = 136;
    public static final int ACTION_WIFI_FORGET = 137;
    public static final int ACTION_WIFI_OFF = 138;
    public static final int ACTION_WIFI_ON = 139;
    public static final int APN = 12;
    public static final int APN_EDITOR = 13;
    public static final int APPLICATION = 16;
    public static final int APPLICATIONS_ADVANCED = 130;
    public static final int APPLICATIONS_APP_LAUNCH = 17;
    public static final int APPLICATIONS_APP_PERMISSION = 18;
    public static final int APPLICATIONS_APP_STORAGE = 19;
    public static final int APPLICATIONS_INSTALLED_APP_DETAILS = 20;
    public static final int APPLICATIONS_PROCESS_STATS_DETAIL = 21;
    public static final int APPLICATIONS_PROCESS_STATS_MEM_DETAIL = 22;
    public static final int APPLICATIONS_PROCESS_STATS_UI = 23;
    public static final int APP_OPS_DETAILS = 14;
    public static final int APP_OPS_SUMMARY = 15;
    public static final int BLUETOOTH = 24;
    public static final int BLUETOOTH_DEVICE_PICKER = 25;
    public static final int BLUETOOTH_DEVICE_PROFILES = 26;
    public static final int CHOOSE_LOCK_GENERIC = 27;
    public static final int CHOOSE_LOCK_PASSWORD = 28;
    public static final int CHOOSE_LOCK_PATTERN = 29;
    public static final int CONFIRM_LOCK_PASSWORD = 30;
    public static final int CONFIRM_LOCK_PATTERN = 31;
    public static final int CRYPT_KEEPER = 32;
    public static final int CRYPT_KEEPER_CONFIRM = 33;
    public static final int DASHBOARD_SEARCH_RESULTS = 34;
    public static final int DASHBOARD_SUMMARY = 35;
    public static final int DATA_USAGE = 36;
    public static final int DATA_USAGE_SUMMARY = 37;
    public static final int DATE_TIME = 38;
    public static final int DEVELOPMENT = 39;
    public static final int DEVICEINFO = 40;
    public static final int DEVICEINFO_IMEI_INFORMATION = 41;
    @Deprecated
    public static final int DEVICEINFO_MEMORY = 42;
    public static final int DEVICEINFO_STORAGE = 42;
    public static final int DEVICEINFO_SIM_STATUS = 43;
    public static final int DEVICEINFO_STATUS = 44;
    public static final int DEVICEINFO_USB = 45;
    public static final int DISPLAY = 46;
    public static final int DREAM = 47;
    public static final int ENCRYPTION = 48;
    public static final int FINGERPRINT = 49;
    public static final int FINGERPRINT_ENROLL = 50;
    public static final int FUELGAUGE_BATTERY_HISTORY_DETAIL = 51;
    public static final int FUELGAUGE_BATTERY_SAVER = 52;
    public static final int FUELGAUGE_POWER_USAGE_DETAIL = 53;
    public static final int FUELGAUGE_POWER_USAGE_SUMMARY = 54;
    public static final int HOME = 55;
    public static final int ICC_LOCK = 56;
    public static final int INPUTMETHOD_KEYBOARD = 58;
    public static final int INPUTMETHOD_LANGUAGE = 57;
    public static final int INPUTMETHOD_SPELL_CHECKERS = 59;
    public static final int INPUTMETHOD_SUBTYPE_ENABLER = 60;
    public static final int INPUTMETHOD_USER_DICTIONARY = 61;
    public static final int INPUTMETHOD_USER_DICTIONARY_ADD_WORD = 62;
    public static final int LOCATION = 63;
    public static final int LOCATION_MODE = 64;
    public static final int LOCATION_SCANNING = 131;
    public static final int MAIN_SETTINGS = 1;
    public static final int MANAGE_APPLICATIONS = 65;
    public static final int MANAGE_APPLICATIONS_ALL = 132;
    public static final int MANAGE_APPLICATIONS_NOTIFICATIONS = 133;
    public static final int MANAGE_DOMAIN_URLS = 143;
    public static final int MANAGE_PERMISSIONS = 140;
    public static final int MASTER_CLEAR = 66;
    public static final int MASTER_CLEAR_CONFIRM = 67;
    public static final int NET_DATA_USAGE_METERED = 68;
    public static final int NFC_BEAM = 69;
    public static final int NFC_PAYMENT = 70;
    public static final int NOTIFICATION = 71;
    public static final int NOTIFICATION_APP_NOTIFICATION = 72;
    public static final int NOTIFICATION_ITEM = 128;
    public static final int NOTIFICATION_ITEM_ACTION = 129;
    public static final int NOTIFICATION_OTHER_SOUND = 73;
    public static final int NOTIFICATION_PANEL = 127;
    public static final int NOTIFICATION_REDACTION = 74;
    public static final int NOTIFICATION_STATION = 75;
    public static final int NOTIFICATION_ZEN_MODE = 76;
    public static final int NOTIFICATION_ZEN_MODE_AUTOMATION = 142;
    public static final int NOTIFICATION_ZEN_MODE_PRIORITY = 141;
    public static final int OWNER_INFO = 77;
    public static final int PRINT_JOB_SETTINGS = 78;
    public static final int PRINT_SERVICE_SETTINGS = 79;
    public static final int PRINT_SETTINGS = 80;
    public static final int PRIVACY = 81;
    public static final int PROXY_SELECTOR = 82;
    public static final int QS_AIRPLANEMODE = 112;
    public static final int QS_BLUETOOTH = 113;
    public static final int QS_CAST = 114;
    public static final int QS_CELLULAR = 115;
    public static final int QS_COLORINVERSION = 116;
    public static final int QS_DATAUSAGEDETAIL = 117;
    public static final int QS_DND = 118;
    public static final int QS_FLASHLIGHT = 119;
    public static final int QS_HOTSPOT = 120;
    public static final int QS_INTENT = 121;
    public static final int QS_LOCATION = 122;
    public static final int QS_PANEL = 111;
    public static final int QS_ROTATIONLOCK = 123;
    public static final int QS_USERDETAIL = 125;
    public static final int QS_USERDETAILITE = 124;
    public static final int QS_WIFI = 126;
    public static final int RESET_NETWORK = 83;
    public static final int RESET_NETWORK_CONFIRM = 84;
    public static final int RUNNING_SERVICE_DETAILS = 85;
    public static final int SCREEN_PINNING = 86;
    public static final int SECURITY = 87;
    public static final int SIM = 88;
    public static final int TESTING = 89;
    public static final int TETHER = 90;
    public static final int TRUSTED_CREDENTIALS = 92;
    public static final int TRUST_AGENT = 91;
    public static final int TTS_ENGINE_SETTINGS = 93;
    public static final int TTS_TEXT_TO_SPEECH = 94;
    public static final int USAGE_ACCESS = 95;
    public static final int USER = 96;
    public static final int USERS_APP_RESTRICTIONS = 97;
    public static final int USER_DETAILS = 98;
    public static final int VIEW_UNKNOWN = 0;
    public static final int VOICE_INPUT = 99;
    public static final int VPN = 100;
    public static final int WALLPAPER_TYPE = 101;
    public static final int WFD_WIFI_DISPLAY = 102;
    public static final int WIFI = 103;
    public static final int WIFI_ADVANCED = 104;
    public static final int WIFI_APITEST = 107;
    public static final int WIFI_CALLING = 105;
    public static final int WIFI_INFO = 108;
    public static final int WIFI_P2P = 109;
    public static final int WIFI_SAVED_ACCESS_POINTS = 106;
    public static final int WIRELESS = 110;
}