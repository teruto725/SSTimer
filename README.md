# SSTimer
# 概要
lolというゲームのサモナースペルを管理するためのタイマーです。  
lolでは相手チームは5人で構成されており、一人2つずづサモナースペルという強力なスキルを持っています。  
しかし、それぞれのスキルには2~5分のどのクールタイムが存在しており、連発してスキルを打つことはできません。  
つまり、敵のサモナースペルのクールタイムを把握し、敵のスキルがクールタイム中に戦闘を仕掛けることでゲームを有利に運ぶことができます。  
ただし、ゲーム画面では敵のスキルのクールタイムは隠されており5*2の計10個のスキルを頭の中で記憶する必要がありこれは困難です。よって私はこのSSTimerを提案します。
# 機能  
このSSTimerはスキルセット画面とタイマー画面の2つから構成されます。  
スキルセット画面では試合前に敵のスキルと対応するようにスキルをコンボボックスから選択します。  
タイマー画面ではスキルセット画面で選択した10個のタイマーで構成され、敵がスキルを使えばボタンを押すことでスキルのクールタイムをカウントすることができます。
# 環境
eclipse neon を用いて開発しました。  
ソースはJavaでSwingを用いてGUIを作成しています。  
Timer処理はthreadを用いて非同期処理で実装しました。

# ダウンロード
下のリンクからjarファイル形式でダウンロードができます。

imageフォルダとjarファイルを同じ階層に設置し実行してください。
https://drive.google.com/drive/folders/1R_eFTN-5lpaJyai8zryYU1pDVOzemDVW?usp=sharing
