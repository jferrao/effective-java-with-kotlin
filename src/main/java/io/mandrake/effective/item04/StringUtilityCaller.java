package io.mandrake.effective.item04;

public class StringUtilityCaller {

    public static void main(String[] args) {

        final String replacedAscii = StringUtility.replaceNonAscii("João", "A");
        System.out.println(replacedAscii);

        final String removedAscii = StringUtility.removeNonAscii("João");
        System.out.println(removedAscii);

        final String removedEmoji = StringUtility.removeEmoji("João hello world _# 皆さん、こんにちは！　私はジョンと申します。\uD83D\uDD25⭐");
        System.out.println(removedEmoji);

        final String noAccents = StringUtility.convertDiacritics("João");
        System.out.println(noAccents);

        final String url = StringUtility.toUrlFriendlySLug("Køtlin extensions by João ©±† €uro \uD83D\uDD25⭐");
        System.out.println(url);

    }

}
