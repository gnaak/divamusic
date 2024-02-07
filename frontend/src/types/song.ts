export interface SangSong {
  practiceResultId: number;
  songTitle: string;
  coverImg: string;
  createdDate: string;
  artist: string;
  score: number;
}

export interface SharedSong {
  memberId: string;
  postId: string;
  nickname: string;
  content: string;
  songTitle: string;
  artist: string;
  recordUrl: string;
}

export interface letsUploadSongs extends SangSong {
  content: string;
}

type Enumerate<
  N extends number,
  Acc extends number[] = [],
> = Acc['length'] extends N
  ? Acc[number]
  : Enumerate<N, [...Acc, Acc['length']]>;

type Range<F extends number, T extends number> = Exclude<
  Enumerate<T>,
  Enumerate<F>
>;

type DifficultyRange = Range<1, 6>;

export type { DifficultyRange };